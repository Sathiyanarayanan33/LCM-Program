class Leastcommon{  //lcm of 6,9
 public static void main(String ar [])
{
 Leastcommon obj=new Leastcommon();
 obj.Multiple();
}
public void Multiple()
  {
   int small=6;
   int large=9;
   int lcm=0;
   int max=(small>large)?large:small;
   while(true){
   if(max%small==0 && max%large==0){
     lcm=max;
   System.out.println(lcm);
   break; }
   max++; 
  }
 }
}
//exop:18
