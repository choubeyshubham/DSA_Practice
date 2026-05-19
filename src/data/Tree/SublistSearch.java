package data.Tree;

import data.Node;

public class SublistSearch {


    void main(){



    }

    public static boolean isSubList(Node first,Node second){
        if(first==null) return true;
        if(second==null) return false;
        Node ptr1=first;
        Node ptr2=second;
        while(second!=null){
            ptr2=second;
            ptr1=first;
            while(ptr1!=null){
                if(ptr2==null || ptr1.data !=ptr2.data){
                    break;
                }
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }

        }



        return false;
    }


}
