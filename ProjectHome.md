![http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/log-CSS-engine-250.png](http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/log-CSS-engine-250.png)

## NOTE: the jars are quite old, you should compile the latest version (new jars coming soon). The engine is now tons of times better than release 1.0 ##

# Introduction #

The **Universal CSS Engine** lets you modify your objects in any java project by using CSS stylesheets.

The aim of this project is to remove the burden of styling UI components by hand, using tons of method calls to change foregrounds, backgrounds and fonts on every component.

The CSS engine has no dependency on any java class outside the common ones. Therefore, it can be used in every kind of project, even if AWT and Swing packages are not present (for instance in Android library).

**Important feature**: the css stylesheets are parsed using a custom parser generated with AntLR. Every rules and functions define the types of their parameters, and the different parameters they can take. Therefore, everything is validated as soon as the stylesheet is parsed, to increase the robustness of the engine.

# Get Started #

If you downloaded the "swing + custom components" API, you first need to register all the predefined rules and functions to the CSS engine. For this, simply use the convenience methods:

```
SwingStyle.init(); // for swing rules and functions
AruiStyle.init();  // for custom components rules and functions
```

Now, applying a css style to your components is very simple:

```
Style style = new Style(myCssFileUrl);
Style.apply(myRootComponent, style);
```

The style is applied to the root component, and then passed to its children automatically.
If you only want to use the Swing rules shipped with the library, then that's all you need to know :)

# Custom components #

I built many custom components to take full advantage of the power of CSS. These components bring (kind of) JavaFX possibilities to Java. I'll add more components in later version of the library. Also, don't hesitate to contribute your own customizable components to the library, using the [issue tracker](http://code.google.com/p/java-universal-css-engine/issues/list).

Components include (in v1.0.0):
  * aurelienribon.ui.components.Button
  * aurelienribon.ui.components.TabPanel
  * aurelienribon.ui.components.GroupBorder

# Creating your own rules and functions #

Adding your own rules and functions is very simple. Better than lengthy sentences, I suggest you to have a look at how are defined the rules and functions of the [Swing backend](http://code.google.com/p/java-universal-css-engine/source/browse/#hg%2Fbackend-swing%2Fsrc%2Faurelienribon%2Fui%2Fcss%2Fswing). The entry point is the [SwingStyle.java](http://code.google.com/p/java-universal-css-engine/source/browse/backend-swing/src/aurelienribon/ui/css/swing/SwingStyle.java) file, which defines the `init()` method used to register all the rules, functions, and processors. Also, please have a look at the [Style.java](http://code.google.com/p/java-universal-css-engine/source/browse/api/src/aurelienribon/ui/css/Style.java) file from the base CSS engine. Its javadoc describes in details how things work.

# Screenshots #

These images were taken from the demo playground, available in the download section: http://code.google.com/p/java-universal-css-engine/downloads/list

![http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/css-engine-1.jpg](http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/css-engine-1.jpg)
![http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/css-engine-2.jpg](http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/css-engine-2.jpg)
![http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/css-engine-3.jpg](http://www.aurelienribon.com/blog/wp-content/uploads/2012/02/css-engine-3.jpg)