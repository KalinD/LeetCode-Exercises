#include <iostream>
#include <vector>

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution
{
public:
    std::vector<int> largestValues(TreeNode *root)
    {
        std::vector<int> res;
        std::vector<TreeNode> nodes;
        if(nullptr == root)
            return res;
        nodes.emplace_back(*root);

        while (nodes.size() > 0)
        {
            int max = nodes.at(0).val;
            std::vector<TreeNode> newNodes;
            for (auto node : nodes)
            {
                if (node.val > max)
                {
                    max = node.val;
                }
                if (nullptr != node.left)
                    newNodes.emplace_back(*(node.left));
                if (nullptr != node.right)
                    newNodes.emplace_back(*(node.right));
            }
            res.emplace_back(max);
            nodes.clear();
            nodes = newNodes;
        }

        return res;
    }
};

void printVector(std::vector<int> &v)
{
    std::cout << "[";
    for (int i = 0; i < v.size() - 1; i++)
    {
        std::cout << v[i] << ", ";
    }
    std::cout << v[v.size() - 1] << "]" << std::endl;
}

int main()
{
    // root = [1,3,2,5,3,null,9]
    Solution sol;
    TreeNode root(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), new TreeNode(2, nullptr, new TreeNode(9)));
    std::vector<int> res = sol.largestValues(&root);
    printVector(res);

    TreeNode root2(1, new TreeNode(2), new TreeNode(3));
    res = sol.largestValues(&root2);
    printVector(res);
    
    TreeNode root3 = NULL;
    res = sol.largestValues(&root3);
    printVector(res);

    return 0;
}