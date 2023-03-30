class ListNode {
  constructor(val, next) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

/* Elegant solition
 * - fast
 * - little memory usage */
var addTwoNumbers = function (l1, l2) {
    let res = new ListNode()
    let l = res
    let carry = 0
    while(l1 || l2 || carry){
        let val = carry
        if (l1){
            val += l1.val
            l1 = l1.next
        }
        if (l2){
            val += l2.val
            l2 = l2.next
        }
        carry = (val - (val % 10)) / 10
        val = val % 10
        l.next = new ListNode(val, undefined)
        l = l.next
    }
    return res.next
};

/* Initial solution
 * - slow
 * - a lot of memory */
var addTwoNumbers = function (l1, l2) {
  let res = new ListNode(undefined, undefined);
  let l = res;
  let toAdd = 0;
  while (l1 && l2) {
    const s = l1.val + l2.val + toAdd;
    console.log(s);
    toAdd = Math.floor(s / 10);
    l.val = s % 10;
    l1 = l1.next;
    l2 = l2.next;
    if (l1 || l2) {
      l.next = new ListNode(undefined, undefined);
      l = l.next;
    }
  }
  while (l1) {
    const s = l1.val + toAdd;
    toAdd = Math.floor(s / 10);
    l.val = s % 10;
    l1 = l1.next;
    if (l1) {
      l.next = new ListNode(undefined, undefined);
      l = l.next;
    }
  }
  while (l2) {
    const s = l2.val + toAdd;
    toAdd = Math.floor(s / 10);
    l.val = s % 10;
    l2 = l2.next;
    if (l2) {
      l.next = new ListNode(undefined, undefined);
      l = l.next;
    }
  }

  while (toAdd > 0) {
    l.next = new ListNode(toAdd % 10, undefined);
    l = l.next;
    toAdd = Math.floor(toAdd / 10);
  }
  return res;
};
