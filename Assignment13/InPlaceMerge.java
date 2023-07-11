public class InPlaceMerge {
    public Node mergeTwoLists(Node list1, Node list2) {

        if(list1!=null && list2!=null){
            if(list1.data<list2.data){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }
}
