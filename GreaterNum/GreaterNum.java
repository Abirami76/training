class GreaterNum{
    public static void main(String[] args){
       int a=34,b=68,c=72;
       int g=(a>b&&b>c)?a:(b>c)?b:c;
       System.out.println("The greatest number is "+g);
    }
}