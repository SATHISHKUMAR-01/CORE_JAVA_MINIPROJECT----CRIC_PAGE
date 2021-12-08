import java.util.*;

class Login
{
  int choice, password;
  Scanner sc_login = new Scanner (System.in);
  void set (int choice)
  {
    this.choice = choice;
  }

  int decision ()
  {
    int flag = 0;
    if (choice == 1)
      {
System.out.println ("Hello admin, Enter Your password : ");
password = sc_login.nextInt ();

if (password == 12345)
 {
   System.out.println ("Log in successfull");
   flag = 1;

 }
else
 {
   System.out.println ("Log in failed");
 }

      }
    else if (choice == 0)
      {
System.out.println ("Hello user , Welcome to the page ");
flag = 2;
      }
    else
      {
System.out.println ("Please enter the correct choice");
      }
    return flag;
  }
}

class Teams
{
  void show ()
  {
    System.out.println ("------------------------------------");
    System.out.println ("THE TEAMS LIST : ");
    System.out.println ("--- 1. CHENNAI SUPER KINGS ");
    System.out.println ("--- 2. MUMBAI INDIANS  ");
    System.out.println ("--- 3. KOLKATA KNIGHT RIDERS  ");
    System.out.println ("--- 4. SUNRISERS HYDERABAD ");
    System.out.println ("--- 5. RAJASTHAN ROYALS ");
    System.out.println ("--- 6. ROYAL CHALLENGERS BANGALORE ");
    System.out.println ("------------------------------------");
  }
}

class Details
{
  HashMap < String, String > csk = new HashMap < String, String > ();
  HashMap < String, String > mi = new HashMap < String, String > ();
  HashMap < String, String > kkr = new HashMap < String, String > ();
  HashMap < String, String > srh = new HashMap < String, String > ();
  HashMap < String, String > rr = new HashMap < String, String > ();
  HashMap < String, String > rcb = new HashMap < String, String > ();

  void csk ()
  {

    csk.put ("Dhoni", "3454 runs");
    csk.put ("Raina", "5550 runs");
    csk.put ("Du Plesis", "2213 runs");
    csk.put ("Jadeja", "123 wickets");
    csk.put ("Bravo", "146 wickets");
    for (Map.Entry m:csk.entrySet ())
      {
System.out.println (m.getKey () + " : " + m.getValue ());
      }

  }

  void mi ()
  {
    HashMap < String, String > mi = new HashMap < String, String > ();
    mi.put ("Rohit", "5454 runs");
    mi.put ("Pollard", "3580 runs");
    mi.put ("Hardik", "1213 runs");
    mi.put ("Malinga", "293 wickets");
    mi.put ("Bumrah", "196 wickets");
  for (Map.Entry m:mi.entrySet ())
      {
System.out.println (m.getKey () + " : " + m.getValue ());
      }

  }

  void srh ()
  {
    HashMap < String, String > srh = new HashMap < String, String > ();
    srh.put ("Warner", "6854 runs");
    srh.put ("Bairstow", "1590 runs");
    srh.put ("Williamson", "3213 runs");
    srh.put ("Rashid khan", "353 wickets");
    srh.put ("Bhuvaneshvar kumar", "286 wickets");
  for (Map.Entry m:srh.entrySet ())
      {
System.out.println (m.getKey () + " : " + m.getValue ());
      }

  }

  void kkr ()
  {
    HashMap < String, String > kkr = new HashMap < String, String > ();
    kkr.put ("Gambhir", "4854 runs");
    kkr.put ("Russel", "2590 runs");
    kkr.put ("Shakib", "2213 runs");
    kkr.put ("Chawla", "153 wickets");
    kkr.put ("Narine", "206 wickets");
  for (Map.Entry m:kkr.entrySet ())
      {
System.out.println (m.getKey () + " : " + m.getValue ());
      }

  }

  void rr ()
  {
    HashMap < String, String > rr = new HashMap < String, String > ();
    rr.put ("Samson", "3554 runs");
    rr.put ("Buttler", "3590 runs");
    rr.put ("Stokes", "2913 runs");
    rr.put ("Unadkat", "113 wickets");
    rr.put ("Archer", "156 wickets");
  for (Map.Entry m:rr.entrySet ())
      {
System.out.println (m.getKey () + " : " + m.getValue ());
      }

  }

  void rcb ()
  {
    HashMap < String, String > rcb = new HashMap < String, String > ();
    rcb.put ("Virat kohli", "6554 runs");
    rcb.put ("AB de villiers", "4590 runs");
    rcb.put ("Maxwell", "2613 runs");
    rcb.put ("Chahal", "213 wickets");
    rcb.put ("Harshal patel", "126 wickets");
  for (Map.Entry m:rcb.entrySet ())
      {
System.out.println (m.getKey () + " : " + m.getValue ());
      }


  }

  void edit_player (String name, int value, int team)
  {
    Scanner s3 = new Scanner (System.in);


    if (team == 1)
      {
System.out.println("The corresponding player is a Bowler or Batsman: \n press 1 for Batsman \n press 0 for Bowler");
int style = s3.nextInt ();
if (style == 1)
 {
   csk.replace (name, String.valueOf (value) + " runs");

 }
else
 {
   csk.replace (name, String.valueOf (value) + " wickets");

 }
 System.out.println ("------------------------------------");
System.out.println ("The Updated players list : ");
System.out.println ("------------------------------------");
      for (Map.Entry m:csk.entrySet ())
 {
   System.out.println (m.getKey () + " : " + m.getValue ());
 }

      }
    else if (team == 2)
      {

System.out.println("The corresponding player is a Bowler or Batsman: \n press 1 for Batsman \n press 0 for Bowler");
int style = s3.nextInt ();
if (style == 1)
 {
   mi.replace (name, String.valueOf (value) + " runs");

 }
else
 {
   mi.replace (name, String.valueOf (value) + " wickets");

 }

System.out.println ("------------------------------------");
System.out.println ("The Updated players list : ");
System.out.println ("------------------------------------");
      for (Map.Entry n:mi.entrySet ())
 {
   System.out.println (n.getKey () + " : " + n.getValue ());
 }


      }
    else if (team == 3)
      {
System.out.
 println
 ("The corresponding player is a Bowler or Batsman: \n press 1 for Batsman \n press 0 for Bowler");
int style = s3.nextInt ();
if (style == 1)
 {
   kkr.replace (name, String.valueOf (value) + " runs");

 }
else
 {
   kkr.replace (name, String.valueOf (value) + " wickets");

 }


System.out.println ("The Update player list : ");
      for (Map.Entry m:kkr.entrySet ())
 {
   System.out.println (m.getKey () + " : " + m.getValue ());
 }


      }
    else if (team == 4)
      {
System.out.
 println
 ("The corresponding player is a Bowler or Batsman: \n press 1 for Batsman \n press 0 for Bowler");
int style = s3.nextInt ();
if (style == 1)
 {
   srh.replace (name, String.valueOf (value) + " runs");

 }
else
 {
   srh.replace (name, String.valueOf (value) + " wickets");

 }

System.out.println ("The Update player list : ");
      for (Map.Entry m:srh.entrySet ())
 {
   System.out.println (m.getKey () + " : " + m.getValue ());
 }


      }
    else if (team == 5)
      {
System.out.
 println
 ("The corresponding player is a Bowler or Batsman: \n press 1 for Batsman \n press 0 for Bowler");
int style = s3.nextInt ();
if (style == 1)
 {
   rr.replace (name, String.valueOf (value) + " runs");

 }
else
 {
   rr.replace (name, String.valueOf (value) + " wickets");

 }

System.out.println ("------------------------------------");

System.out.println ("The Update player list : ");
System.out.println ("------------------------------------");
      for (Map.Entry m:rr.entrySet ())
 {
   System.out.println (m.getKey () + " : " + m.getValue ());
 }


      }
    else if (team == 6)
      {
System.out.
 println
 ("The corresponding player is a Bowler or Batsman: \n press 1 for Batsman \n press 0 for Bowler");
int style = s3.nextInt ();
if (style == 1)
 {
   rcb.replace (name, String.valueOf (value) + " runs");

 }
else
 {
   rcb.replace (name, String.valueOf (value) + " wickets");

 }

System.out.println ("The Update player list : ");
      for (Map.Entry m:rcb.entrySet ())
 {
   System.out.println (m.getKey () + " : " + m.getValue ());
 }


      }

  }
}

class Admin extends Details
{
  int choice;
  String name;
  Scanner sc2 = new Scanner (System.in);
  void set (int choice)
  {
    this.choice = choice;
  }

  void find ()
  {
    if (choice == 1)
      {
super.csk ();
      }
    else if (choice == 2)
      {
super.mi ();
      }
    else if (choice == 3)
      {
super.srh ();
      }
    else if (choice == 4)
      {
super.kkr ();
      }
    else if (choice == 5)
      {
super.rr ();
      }
    else if (choice == 6)
      {
super.rcb ();
      }

  }

  void edit (int choice_team, String name)
  {

    this.name = name;
    int team_choice = choice_team;
    System.out.println ("Enter the new value ( runs / wickets ) :");
    int new_value = sc2.nextInt ();
    super.edit_player (name, new_value, team_choice);




  }



}

class User extends Details
{
  int choice;
  void set (int choice)
  {
    this.choice = choice;
  }

  void find ()
  {
    if (choice == 1)
      {
super.csk ();
      }
    else if (choice == 2)
      {
super.mi ();
      }
    else if (choice == 3)
      {
super.srh ();
      }
    else if (choice == 4)
      {
super.kkr ();
      }
    else if (choice == 5)
      {
super.rr ();
      }
    else if (choice == 6)
      {
super.rcb ();
      }
  }

}




public class CRICINFO
{

  public static void main (String[]args)
  {
    Login lg = new Login ();
    Teams ts = new Teams ();
    Admin ad = new Admin ();
    User us = new User ();
    Details dt = new Details ();


      System.out.println ("------------------------------------");

      System.out.println (" IPL CRIC---INFO");
      System.out.println ("------------------------------------");

      System.out.println (" Log in \n Are you the User or Admin ?");

      System.out.println (" If you are the admin , Press 1");
      System.out.println (" If you are the user , Press 0");
    Scanner sc = new Scanner (System.in);
      System.out.println ("------------------------------------");

      System.out.println ("Enter your choice : ");
    int choice = sc.nextInt ();


      lg.set (choice);

    int status = lg.decision ();

    if (status == 0)
      {
System.out.println ("Admin - log in failed \n Try again.....");

      }

    else if (status == 1)
      {
ts.show ();
System.
 out.println ("Enter the Team Number to edit/view the stats : ");
Scanner sc1 = new Scanner (System.in);
int team_choice = sc1.nextInt ();


System.out.println ("Do you want to edit or view");
System.out.println ("Admin, If you want to edit , Press 1");
System.out.println ("Admin, If you want to view , Press 0");

System.out.println ("Enter the operation wish : ");

int operation_wish = sc1.nextInt ();

if (operation_wish == 1)
 {
   System.out.println ("------------------------------------");
   System.out.println ("Edit Option Enabled");
   System.out.println ("------------------------------------");
   System.out.println ("The Players List ");

   System.out.println ("------------------------------------");

   ad.set (team_choice);
   ad.find ();
   System.out.println ("------------------------------------");

   System.out.println
     ("In this team , which player stats you want to edit ?");
   System.out.println ("Enter the player name : ");
   String name = sc1.next ();
   ad.edit (team_choice, name);






 }
else if (operation_wish == 0)
 {

   System.out.println ("------------------------------------");
   System.out.println ("The Players List ");

   System.out.println ("------------------------------------");

   ad.set (team_choice);
   ad.find ();
   System.out.println ("------------------------------------");

 }
      }
    else if (status == 2)
      {
ts.show ();
System.out.println ("Enter the Team Number to view the stats : ");
Scanner sc1 = new Scanner (System.in);
int team_choice = sc1.nextInt ();

System.out.println ("------------------------------------");
System.out.println ("The Players List ");

System.out.println ("------------------------------------");

ad.set (team_choice);
ad.find ();
System.out.println ("------------------------------------");

      }
  }
}