class Solution
{
public:
    ListNode *deleteDuplicates(ListNode *head)
    {
        ListNode *ptr = head;

        while (ptr)
        {
            ListNode *p1 = ptr->next;
            while (ptr->next && p1->val == ptr->val)
            {
                swap(p1->val, ptr->val);
                ptr->next = ptr->next->next;
                p1 = p1->next;
            }
            ptr = ptr->next;
        }
        return head;
    }
};