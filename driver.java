import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;
import java.util.Collections;
public class driver{

  public static void main(String[] args){

// CREATE SOME ARTISTS
    artist a1 = new artist("Ed Sheeran");
    artist a2 = new artist("Justin Bierber");
    artist a3 = new artist("The Weekend");
    artist a4 = new artist("Harry Style");
    artist a5 = new artist("Dua lipa");
    artist a6 = new artist("Bad Bunny");
    artist a7 = new artist("Ariana Grande");
    artist a8 = new artist("Micheal Jackson");
    artist a9 = new artist("Beyonce");
    artist a10 = new artist("Rihanna");
    artist a11 = new artist("Nirvana");
    artist a12 = new artist("Drake");
    artist a13 = new artist("21 Savage");
    artist a14 = new artist("Kendric Lamar");
    artist a15 = new artist("The Beatles");
    artist a16 = new artist("Gorilla");
    artist a17 = new artist("Rafiohead");
    artist a18 = new artist("KISS");
    artist a19 = new artist("Red Hot Chili Peppers");
    artist a20 = new artist("Madonaa");
    // podcater

    artist a21 = new artist("Joe Rogan");
    artist a22 = new artist("Alexandra Cooper");
    artist a23 = new artist("Michael Barbaro");
    artist a24 = new artist("Ashley Flowers & Brit Prawat");

// CREATE SONE SONGS
    song s1 = new song ("Children",a2, "Pop","Elecrto");
    song s2 = new song("Don't", a1, "Pop", "altenative");
    song s3 = new song("Can't Feel my facwe", a3, "Pop","Hip Hop","electro");
    song s4 = new song("As it Was", a4, "Pop","Rock","altenative");
    song s5 = new song("Fever", a5, "Pop", "elctro");
    song s6 = new song("DÁKITI", a6, "Latino","Pop");
    song s7 = new song("Position", a7, "Pop");
    song s8 = new song("Remember be the time", a8, "Pop", "Rock");
    song s9 = new song("Halo", a9, "Pop");
    song s10 = new song("Needed me", a10, "Pop", "Hip Hop");
    song s11 = new song("Feels like teen spirit", a11, "Rock","Grunge", "altenative");
    song s12 = new song ("Controla",a12, "Rap","Pop","Afro");
    song s13 = new song ("No Heart",a13, "Rap","Hip Hop");
    song s14 = new song ("Swimming Pool",a15, "Rap","Hip Hop");
    song s15 = new song ("here Comes the sun",a15, "Rock");
    song s16 = new song ("Clint Eastwood",a16, "Rock","Hip Hop");
    song s17 = new song ("Creep",a17, "Rock","altenative");
    song s18 = new song ("I was made for loving you",a18, "Rock");
    song s19 = new song ("califormication",a19,"Rock","altenative");
    song s20 = new song ("Hung up",a20,"Pop");

    podcast po1 = new podcast("The Daily", a23, "Long-form journalism","Political",1);
    podcast po2 = new podcast("The Joe Rogan Experience", a21, "Talk",3);
    podcast po3 = new podcast("Call Her Daddy", a22, "comedy","talk", "interviews",55);
    podcast po4 = new podcast("Crime Junkie", a24, "Crime",44);
    // podcast
    playlist pa1 = new playlist("Feels like Pop");
    playlist pa2 = new playlist("Feels like Rock");
    playlist pa3 = new playlist("Feels like Hip Hop");


// ADD SONGS TO THE FIRST PLAYLIST
    pa1.add(s1);
    pa1.add(s2);
    pa1.add(s3);
    pa1.add(s4);
    pa1.add(s5);
    pa1.add(s6);
    pa1.add(s7);
    pa1.add(s8);
    pa1.add(s9);
    pa1.add(s12);
    pa1.add(s20);


// ADD SONGS TO THE SECOND PLAYLST
    pa2.add(s4);
    pa2.add(s8);
    pa2.add(s11);
    pa2.add(s15);
    pa2.add(s16);
    pa2.add(s17);
    pa2.add(po2);
    pa2.add(s18);
    pa2.add(po4);

// ADD SONGS TO THE THIRD PLAYLST

    pa3.add(s10);
    pa3.add(s12);
    pa3.add(po3);
    pa3.add(s13);
    pa3.add(s14);
    pa3.add(po1);

// START TO DISPLAY THE OPTIONS
try{ // try clause
    System.out.println("Hello Aliens, welcome to Serenafy, What do you want to do here:\n");
    System.out.println("1: Create a listener account\n");
    System.out.println("2: See all the playlists we have\n");
    System.out.println("3: Add a song to one of our existing playlists\n");
    System.out.println("4: Export all songs on the platform out to a file in ascending order by times streamed\n");
    System.out.println("5: Exit\n");
    Scanner scnr = new Scanner(System.in); // create the scanner

    String answerStr = scnr.nextLine(); // get input
    int answer = Integer.parseInt(answerStr);


  while(answer!=5){ // while the answer is not equal to 5



      if(answer == 1){ //if it is one
        System.out.println("You are going to create an account \ngive me your username");
        String name = scnr.nextLine(); // ask for a username
        listener lis = new listener(name);
        System.out.println("YOU ARE ALL SET !!\n");
        System.out.println("what do you want to do now:\n"); // ask the use again for anothe option
        System.out.println("1: Create a listener account\n");
        System.out.println("2: See all the playlists we have\n");
        System.out.println("3: Add a song to one of our existing playlists\n");
        System.out.println("4: Export all songs on the platform out to a file in ascending order by times streamed\n");
        System.out.println("5: Exit\n");
        answerStr = scnr.nextLine(); // get input
        answer = Integer.parseInt(answerStr);

      }

      else if(answer==2){ //if they want to see the playlist
        System.out.println("1: "+pa1.toString()+"\n"); // use the to string methods to print the fist playlist
        System.out.println("2: "+pa2.toString()+"\n"); // use the to string methods to print the second playlist
        System.out.println("3: "+pa3.toString()+"\n"); // use the to string methods to print the third playlist


        System.out.print("Which one do you want to shuffle ??\n"); // ask them the one they want to play
        String playlistStr = scnr.nextLine();
        int playlist = Integer.parseInt(playlistStr);
        if ( playlist == 1){ //if they want playlist 1
          pa1.shuffle();// we suffle play this playlist
        }
        else if( playlist == 2){ //if they want playlist 2
          pa2.shuffle(); ;// we suffle play this playlist
        }
        else if (playlist == 3){//if they want playlist 3
          pa3.shuffle(); // we suffle play this playlist
        }

        System.out.println("what do you want to do now:\n"); // prompt the user again for what they want to do
        System.out.println("1: Create a listener account\n");
        System.out.println("2: See all the playlists we have\n");
        System.out.println("3: Add a song to one of our existing playlists\n");
        System.out.println("4: Export all songs on the platform out to a file in ascending order by times streamed\n");
        System.out.println("5: Exit\n");
        answerStr = scnr.nextLine(); // get input
        answer = Integer.parseInt(answerStr);
      }

      else if(answer==3){ // if they wan to add a song to a playlist

        System.out.println("what is the name of the artiste of this song?"); // ask the use for a name for the astist
        String artist = scnr.nextLine(); // get input
        artist a = new artist(artist);  // create an artist with that name
        System.out.println("what is the name of your song?"); // ask for a song title
        String song = scnr.nextLine(); // get input
        System.out.println("what is the type of your song?"); // ask for a genre
        String genre = scnr.nextLine(); // get input
        song s = new song(song,a,genre);  // create the song


        System.out.print("To what playlist do you want to add the song on to ??\n Here are the options:\n"); // ask them for a playlist
        // show them the playlists title
        System.out.println("1: "+pa1.title);
        System.out.println("2: "+pa2.title);
        System.out.println("3: "+pa3.title);
        String playlistStr2 = scnr.nextLine(); // get input for the answeer
        int playlist2 = Integer.parseInt(playlistStr2);
        if ( playlist2 == 1){ // if they choose 1
          pa1.add(s); // add their song to this playlist
        }
        else if( playlist2 == 2){ // if they choose 2
          pa2.add(s); // add their song to this playlist
        }
        else if (playlist2 == 3){ // if they choose 12
          pa3.add(s); // add their song to this playlist
        }

        //prompt them again for another option
        System.out.println("what do you want to do now:\n");
        System.out.println("1: Create a listener account\n");
        System.out.println("2: See all the playlist we have\n");
        System.out.println("3: Add a song to one of our existing playlist\n");
        System.out.println("4: Export all songs on the platform out to a file in ascending order by times streamed\n");
        System.out.println("5: Exit\n");
        answerStr = scnr.nextLine(); // get input
        answer = Integer.parseInt(answerStr);

      }

      else if(answer == 4 ){ // if they want to export the content to a file

        try{ // try
          PrintWriter aw = new PrintWriter( new FileWriter("music.txt")); // write into a file
          LinkedList<content> paSorted = new LinkedList<content>(); // create a list to put all the songs from the platefrome in
          for(content c1: pa1.getColl()){ //iterate through the first playlist
            paSorted.add(c1); // add each song to the list
          }
          for(content c2: pa2.getColl()){ //iterate through the second playlist
            paSorted.add(c2); // add each song to the list
          }
          for(content c3: pa3.getColl()){ //iterate through the third playlist
            paSorted.add(c3); // add each song to the list
          }

          Collections.sort(paSorted); // sort out list in ascending order of streams

          for(content c : paSorted){ // iterate through the Linkedlist

                aw.print(c.toString()); // print each song
                aw.print("\n");
            }



          aw.close();// close the file

          //prompt the user again forwhat they want to do
          System.out.println("what do you want to do now:\n");
          System.out.println("1: Create a listener account\n");
          System.out.println("2: See all the playlist we have\n");
          System.out.println("3: Add a song to one of our existing playlist\n");
          System.out.println("4: Export all songs on the platform out to a file in ascending order by times streamed\n");
          System.out.println("5: Exit\n");
          answerStr = scnr.nextLine();
          answer = Integer.parseInt(answerStr);

        }
        catch(IOException e){ // catch the IOException
          System.err.println("couldn't upload to file");
          break;
        }
      }


      else{ // if they give an number that is not an option
        System.out.println("Sorry this is not one of our optionn try again with a number from 1 to 5");
        answerStr = scnr.nextLine();
        answer = Integer.parseInt(answerStr);
      }
    }


    if (answer==5){ // print a little goodbye when they want to exit
      System.out.println("Goodbye");
    }
  }

    catch(NumberFormatException e){ // catch the format error
      System.out.println("Sorry this is not a valid optionn");
    }
  }
}





// NumberFormatException
