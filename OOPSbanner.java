public class OOPSbanner {
   public static String[] Opattern(){
    return new String[]{"   ***   ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "   ***   "}; };
   public static String[] Ppattern(){
    return new String[]{"*******  ",
                        "**    ** ",
                        "**     **",
                        "**    ** ",
                        "*******  ",
                        "**       ",
                        "**       "}; };
   public static String[] Spattern(){
    return new String[]{"  *****  ",
                        " **   ** ",
                        "**       ",
                        "  *****  ",
                        "      ** ",
                        " **   ** ",
                        "  *****  "}; };

    public static void main(String[] args) {int i;
     String[] O=Opattern();
     String[] P=Ppattern();
     String[] S=Spattern();
     for (i=0;i<O.length;i++){
      System.out.println(O[i]+" "+O[i]+" "+P[i]+" "+S[i]);
     }
   }
}