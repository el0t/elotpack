Elot Pack
==============================
- To help you guys understand my code: everything is registered in the `util/RegistryHandler` class, the important info for each new object is pretty much contained there. The ElotPack class just runs the `init` function from RegistryHandler So you can probably read RegistryHandler and figure everything else out.........
- There's base classes for items and blocks and also crops.... just in case there's methods we want to override or something.... came in handy when I wanted to make the new materials usable for beacons
- The json files for recipes and stuff like that are in resources/data
- Textures (pixel arts) are in resources/assets

Other useful commands:
------------------------------
| Command 			   | Purpose 						  |
| -----   			   | -----   						  |
| `gradlew build` 	  	   | build the mod 					  |
| `gradlew runClient` 		   | build and test your mod 				  |
| `gradlew genEclipseRuns` 	   | may be required to download dependences for eclipse  |
| `gradlew --refresh-dependencies` | refreshes dependencies (in case of IDE issues)	  |
| `gradlew clean` 		   | starts you off fresh again (doesn't change your code)|

Quick git reference:
------------------------------
- Fork el0t/elotpack in github
- Clone your fork to your local machine
  - Add original fork as source: `git remote add el0t git@github.com:el0t/elotpack.git`
  - (_opt_) Confirm you're on master: `git checkout master`
- Create a new branch: `git checkout -b my-new-feature-branch`
- Set new upstream branch: `git push --set-upstream origin my-new-feature-branch`
- Bang out some code and commit it 
  - (_opt_) When you're ready to Pull, clean up your commits with `git rebase -i HEAD~<num>`, where `<num>` is the number of commits you've made
- Create a pull request from your branch to the main fork in [Github](https://github.com/el0t/elotpack)
- (_opt_) Once approved, pull changes from remote master to your master branch: `git pull el0t master`


<br><br>
Info from Forge:
===========================================
Source installation information for modders
-------------------------------------------
This code follows the Minecraft Forge installation methodology. It will apply
some small patches to the vanilla MCP source code, giving you and it access 
to some of the data and functions you need to build a successful mod.

Note also that the patches are built against "unrenamed" MCP source code (aka
srgnames) - this means that you will not be able to read them directly against
normal code.

Source pack installation information:

Standalone source installation
------------------------------

See the Forge Documentation online for more detailed instructions:
http://mcforge.readthedocs.io/en/latest/gettingstarted/

Step 1: Open your command-line and browse to the folder where you extracted the zip file.

Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command: "gradlew genEclipseRuns" (./gradlew genEclipseRuns if you are on Mac/Linux)
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run "gradlew eclipse" to generate the project.
(Current Issue)
4. Open Project > Run/Debug Settings > Edit runClient and runServer > Environment
5. Edit MOD\_CLASSES to show [modid]%%[Path]; 2 times rather then the generated 4.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: "gradlew genIntellijRuns" (./gradlew genIntellijRuns if you are on Mac/Linux)
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can run "gradlew --refresh-dependencies" to refresh the local cache. "gradlew clean" to reset everything {this does not affect your code} and then start the processs again.

Should it still not work, 
Refer to #ForgeGradle on EsperNet for more information about the gradle environment.
or the Forge Project Discord discord.gg/UvedJ9m

Forge source installation
-------------------------
MinecraftForge ships with this code and installs it as part of the forge
installation process, no further action is required on your part.

LexManos' Install Video
-----------------------
https://www.youtube.com/watch?v=8VEdtQLuLO0&feature=youtu.be

For more details update more often refer to the Forge Forums:
http://www.minecraftforge.net/forum/index.php/topic,14048.0.html
