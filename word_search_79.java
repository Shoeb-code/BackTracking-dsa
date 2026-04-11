package BackTracking;

public class word_search_79 {
    public static void main(String[] args) {
        char [][] maze={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";

        int m=maze.length;
        int n=maze[0].length;



        for(int i=0; i<m; i++ ){
            for(int j=0; j<n; j++){
                if(maze[i][j]==word.charAt(0)){
                    boolean ans = findWordSearch(maze,word,0,i,j);
                    System.out.print(ans);

                }
            }
        }

    }
    public static boolean  findWordSearch(char [][] maze,String word,int idx,int cr,int cc){
        if(idx==word.length()){
            return true;
        }

        if(cc<0 || cc>=maze[0].length || cr<0 || cr>=maze[0].length || maze[cr][cc]!=word.charAt(idx)){
            return  false;
        }

        int [] r={1,0,-1,0};
        int [] c={0,1,0,-1};

        maze[cr][cc]= '&';

        for(int i=0;  i<r.length; i++){
           boolean ans = findWordSearch(maze,word,idx+1,cr+r[i],cc+c[i]);
           if (ans){
               return  true;
           }
        }

        maze[cr][cc]= word.charAt(idx); // undo step

        return false;
    }

}
