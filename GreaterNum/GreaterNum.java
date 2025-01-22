class GreaterNum{
    public static void main(String[] args){
       int a=34,b=72,c=68;
       int g=(a>b&&a>c)?a:(b>c)?b:c;
       System.out.println("The greatest number is "+g);
    }
}