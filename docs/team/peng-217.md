# Peng Fei - Project Portfolio Page

## Project: The Great Detective
The Great Detective is a command line interactive murder-mystery game. It allows user to enjoy solving cases. 


### Summary of Contributions

- `Feature`: Note Class
    - What it does: Note is the basic unit of note function, it contains scene index, title, and content. 
    - Justification: This allows user to take a note with scene index, title and content. Scene index is automatically generated by the program, title and content are wrote by 
user.


- `Feature`: NoteList class
    - What it does: The NoteList is a collection of all notes that user created, and it performs all note-related functions, such as\
      create a note, open a note, delete notes, search notes using keywords/scene index.
    - Justification: It performs all note-related functions. For example, create a note (with scene index, title and content), open/search an exiting note, delete a note/delete all notes.
    - Highlights: The note index is automatically generated, no need to be typed in by user. And if no title is provided by user, a default title will be provided, like `DEFAULT(1)`. 



- `Feature`: Search Note using keywords
    - What it does: Allows user to search existing notes with multiple keywords (in note title).
    - Justification: Sometimes if there are too many notes, and user want to find the specific notes with title's keywords, then he/she can simply use this search function and type in as many keywords as they want to search for relevant notes.


- `Feature`: Search Note using scene index
    - What it does: Allows user to search existing notes with scene index. 
    - Justification: As each note contains an automatically generated scene index, when user is investigating, he/she can just type in the scene index and search for notes with that scene index. 


- `Feature`: GameNoteFileManager class
    - What it does: The GameNoteFileManager stores all the existing notes locally, and it will open all stored notes when the game is started. A new note file will be created if there is corruption being detected in the old note file.
    - Justification: After user make changes to notes (like create or delete), all the changes will be saved locally and will be loaded at the start of the game.
    

  
- `Feature`: Note-related methods in Ui class
    - What it does: The note-related methods in Ui class give all the note-related output to user.
    - Justification: Including note printing, error message, instructions and so on.
    
  
- `Feature`: Note-related exceptions
    - What it does: To handle errors more organized and tell users what goes wrong.
    - Justification: This can give both user and developer a clearer view about the errors, and reduces the risk of program crashing.
    - Highlights: When some user-input related error happens, user can re-type his/her command instantly instead of quiting the current note process. (i.e. No need to restart note process)
  

- `Code Contribution`: [RepoSense Link](https://nus-cs2113-ay2122s1.github.io/tp-dashboard/?search=peng-217&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2021-09-25)


- `Enhancements implemented`:
   - Wrote Junit test for all note-related classes. 
   - Implement quit command for note function, allowing user to quit note function at anytime they want.


- `Community` : Reviewed other's PR. (Pull request [\#213](https://github.com/AY2122S1-CS2113-T14-1/tp/pull/213))


- `Documentation`:

  - `User Guide`:
  Added documentation for the Note-related features. (Pull request [\#244](https://github.com/AY2122S1-CS2113-T14-1/tp/pull/244/files))


  - `Developer Guide`:
    - Added documentation and UML diagram for 'Ui' component. (Pull request [\#249](https://github.com/AY2122S1-CS2113-T14-1/tp/pull/249/files))
    - Added documentation and UML diagram for 'Note' component. (Pull request [\#249](https://github.com/AY2122S1-CS2113-T14-1/tp/pull/249/files))


  - `Javadoc`:
    - Added Javadoc for all note-related methods. (Pull request [\#244](https://github.com/AY2122S1-CS2113-T14-1/tp/pull/244/files))


- `Contributions beyond the project team` :
   - Reviewed other team's project. [Example](https://github.com/nus-cs2113-AY2122S1/tp/pull/46)
   - Report bugs for other team's project during PE dry run. [Bugs reported](https://github.com/peng-217/ped/issues)