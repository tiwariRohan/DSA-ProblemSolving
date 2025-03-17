import java.util.ArrayList;
import java.util.List;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(pathDiagonal("", 3, 3));
    }
    static int mazeSolving(int row,int col){
        if(row==1||col==1){
            //row||col because when any one become 1 it's mean you got only one path to go
            // int count=0;
            return 1;
        }
        int right=mazeSolving(row, col-1);
        int down=mazeSolving(row-1, col);
        return right+down;
    }

    static List<String> path(String p,int row,int col){
        if(row==1&&col==1){//row&&col==1 because when it will hit mean one complete path
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans=new ArrayList<>();
        if(row>1){
            ans.addAll(path(p+'D', row-1, col));
        }
        if(col>1){
            ans.addAll(path(p+'R', row, col-1));
        }
       
        return ans;
}

static List<String> pathDiagonal(String p,int row,int col){
    if(row==1&&col==1){//row&&col==1 because when it will hit mean one complete path
        List<String> list=new ArrayList<>();
        list.add(p);
        return list;
    }
    List<String> ans=new ArrayList<>();
    if(row>1&&col>1){
        ans.addAll(pathDiagonal(p+'D', row-1, col-1));
    }
    if(row>1){
        ans.addAll(pathDiagonal(p+'V', row-1, col));
    }
    if(col>1){
        ans.addAll(pathDiagonal(p+'H', row, col-1));
    }
   
    return ans;
}

    
}
