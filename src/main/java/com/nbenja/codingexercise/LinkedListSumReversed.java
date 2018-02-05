package com.nbenja.codingexercise;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 */
public class LinkedListSumReversed {

    class ListNode {

        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object obj) {
            return EqualsBuilder.reflectionEquals(this, obj, true);
        }

        @Override
        public int hashCode() {
            return HashCodeBuilder.reflectionHashCode(this, true);
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag = true;
        ListNode result = null;
        ListNode head = null;
        int tempResult = 0;
        while (flag) {

            ListNode temp = new ListNode();

            int l1Value = 0;
            int l2Value = 0;

            if (l1 == null && l2 == null) {
                if(tempResult ==1) {
                    while(result.next !=null) {
                        result = result.next;
                    }
                    result.next = new ListNode(tempResult, null);
                }
                break;
            }
            if (l1 != null) {
                l1Value = l1.val;
            }
            if (l2 != null) {
                l2Value = l2.val;
            }
            int sum = l1Value + l2Value + tempResult;
            if (sum - 10 > 0) {
                temp.val = sum - 10;
                tempResult = 1;
            } else if(sum == 10) {
                temp.val = 0;
                tempResult = 1;
            }
            else {
                temp.val = sum;
                tempResult = 0;
            }
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
            if (result == null) {
                result = temp;
                head = temp;
            } else {
                while(result.next !=null) {
                    result = result.next;
                }
                result.next = temp;
            }
        }
        return head;
    }

    public void test() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, null))))));
        ListNode l2 = new ListNode(1, new ListNode(9,new ListNode(9, new ListNode(7, null)) ));

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(addTwoNumbers(l1, l2));

    }

    public static void main(String[] args) {
        LinkedListSumReversed linkedListSumReversed = new LinkedListSumReversed();
        linkedListSumReversed.test();
    }
}
