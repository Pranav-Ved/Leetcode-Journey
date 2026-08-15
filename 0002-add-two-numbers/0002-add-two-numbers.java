/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        // Iterate while there are nodes left to process in l1 or l2, or if there is a remaining carry
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // Add value from l1 if it exists
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from l2 if it exists
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate the new carry and the value for the current digit node
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            
            // Move the current pointer forward
            curr = curr.next;
        }

        // Return the actual head node of the merged list (skipping the dummy node)
        return dummyHead.next;
    }
    }
