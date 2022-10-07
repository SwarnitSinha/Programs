class Solution
{
public:
    void deleteNode(ListNode *node)
    {
        ListNode *p1 = node->next;
        int temp = node->val;
        node->val = p1->val;
        p1->val = temp;

        ListNode *ptr = node->next;
        node->next = node->next->next;
        delete ptr;
    }
};