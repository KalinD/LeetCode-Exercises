
/* Initial solution
 * - slow
 * - a lot of memory */
var lengthOfLongestSubstring = function(s) {
    const longestPossible = new Set(s).size
    let longest = 0
    const lastSeen = {}
    for(let i = 0; i < s.length; i++){
        if (!(s[i] in lastSeen)){
            lastSeen[s[i]] = i
        }
        let length = i - lastSeen[s[i]]
        if (length === longestPossible){
            return longestPossible
        } 
        if (length > longest){
            longest = length
        }
        lastSeen[s[i]] = i
    }

    return longest == 0 ? longestPossible : longest
};

console.log(lengthOfLongestSubstring('aab'))
