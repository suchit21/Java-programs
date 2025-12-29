
class Player {
    int jersey_no;
    String p_name;
    int wickets;
    String teamName;

   
    Player(int j, String p , int w, String t) {
        jersey_no= j;
          p_name = p;
        wickets=w;
        teamName=t;
    }

    
    void display() {
        System.out.println(jersey_no + "," + p_name + "," + wickets + "," + teamName);
    }


 
    public static void main(String[] args) {

        Player p1  = new Player(45, "Rohit Sharma", 8, "MI");
        Player p2  = new Player(33, "Hardik Pandya", 53, "MI");
        Player p3  = new Player(93, "Jasprit Bumrah", 145, "MI");
        Player p4  = new Player(11, "Ishan Kishan", 0, "MI");
        Player p5  = new Player(63, "Suryakumar Yadav", 0, "MI");
        Player p6  = new Player(23, "Tilak Varma", 2, "MI");
        Player p7  = new Player(17, "Cameron Green", 12, "MI");
        Player p8  = new Player(99, "Akash Madhwal", 15, "MI");
        Player p9  = new Player(27, "Piyush Chawla", 156, "MI");
        Player p10 = new Player(4, "Tim David", 0, "MI");
        Player p11 = new Player(9, "Arjun Tendulkar", 3, "MI");

        
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();
        p8.display();
        p9.display();
        p10.display();
        p11.display();
    }
}
// output:
//45,Rohit Sharma,8,MI
//33,Hardik Pandya,53,MI
//93,Jasprit Bumrah,145,MI
//11,Ishan Kishan,0,MI
//63,Suryakumar Yadav,0,MI
//23,Tilak Varma,2,MI
//17,Cameron Green,12,MI
//99,Akash Madhwal,15,MI
//27,Piyush Chawla,156,MI
//4,Tim David,0,MI
//9,Arjun Tendulkar,3,MI


