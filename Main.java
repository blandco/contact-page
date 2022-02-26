import java.io.*;
import java.util.Scanner; 
class Main 
{
  public static void main(String[] args) throws IOException
  {
    
    // Vars
    String userFileName;
    String instructions = "This program will generate a personal webpage for you.\nAnswer the following questions:\n";
    String promptFileName = "Enter file name: ";
    String promptName = "What's your name? ";
    String promptEmail = "What's your email address? ";
    String promptColor = "Write 1-2 sentences about youself: ";
    String promptSkills = "List three skills or acheivements: \n(Press Enter after each one)\n";
    String done = "File contents written to disk!\n";
    String fileExists = "The file \"%s\" already exists.\nEnter the name again to overwrite the " +
    "existing file.\nOr enter another name to continue.\n";
    String name;
    String email;
    String color;
    String skill01;
    String skill02;
    String skill03;
    String htmlTags = "<!DOCTYPE html><html lang=\"en\" class=\"h-100\"><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcome</title><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"><meta name=\"theme-color\" content=\"#7952b3\"></head><body class=\"d-flex h-100 text-center text-white bg-dark\" style=\"text-shadow: 0 .05rem .1rem rgba(0, 0, 0, .5);  box-shadow: inset 0 0 5rem rgba(0, 0, 0, .5);\"> <div class=\"cover-container d-flex w-100 h-100 p-3 mx-auto flex-column\" style=\"max-width: 42em;\">  <header class=\"mb-auto\"><div>      <h3 class=\"float-md-start mb-0\">✨ %S</h3></div>  </header><main class=\"px-3\"><h1>Hello, I'm %s</h1>    <p><hr></p>    <p class=\"lead\">%s</p>              <div class=\"container px-4\">        <div class=\"row gx-5\">          <div class=\"col\">           <div class=\"p-3 border bg-dark\">%s</div>          </div>          <div class=\"col\">            <div class=\"p-3 border bg-dark\">%s</div>          </div>          <div class=\"col\">            <div class=\"p-3 border bg-dark\">%s</div>          </div>        </div>      </div><br><br><br>      <div class=\"container px-4\">        <div class=\"row\">          <div class=\"col\">            <p class=\"lead\">                <a href=\"mailto:%s\" class=\"btn btn-lg btn-secondary fw-bold border-white bg-white\" style=\"color: #333;            text-shadow: none;\">Contact</a>            </p>          </div>        </div>      </div>        </main><footer class=\"mt-auto text-white-50\"><p>Built with Java and <a href=\"https://getbootstrap.com\" class=\"text-white\">Bootstrap</a> by <a href=\"https://github.com/blandco\" class=\"text-white\">@blandco</a></p>  </footer></div>     </body></html>";

    // Create scanner object for input.
    Scanner keyboard = new Scanner(System.in);

    // Display instructions.
    System.out.printf(instructions);

    // Get name.
    System.out.printf(promptName);
    name = keyboard.nextLine();

    // Get email.
    System.out.printf(promptEmail);
    email = keyboard.nextLine();

    // Get color.
    System.out.printf(promptColor);
    color = keyboard.nextLine();

    // Get skills.
    System.out.printf(promptSkills);
    skill01 = keyboard.nextLine();
    skill02 = keyboard.nextLine();
    skill03 = keyboard.nextLine();

    // Get file name.
    System.out.printf(promptFileName);
    userFileName = keyboard.nextLine();

    // Check for existing file first.
    File file = new File(userFileName);
    if (file.exists())
    {
      System.out.printf(fileExists, userFileName);
      System.out.printf(promptFileName);
      userFileName = keyboard.nextLine();
    }
    // Create new file. 
    PrintWriter outputfile = new PrintWriter(userFileName);

    // Write contents to file.
    outputfile.printf(htmlTags, name, name, color, skill01, skill02, skill03, email);

    //Close the file and keyboard.
    outputfile.close();
    keyboard.close();

    // Done.
    System.out.printf(done);

  }
}
