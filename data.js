

var str_w3s = "w3schools Tutorial";
var str_orc = "Oracle Java Tutorial";
var str_orR = "Oracle Java Reference";
var str_prT = "Princeton CS Tutorial"
var str_lBr = "BREAK"
var str_tbd = "-TBD-";


var data_javaBasics = [

  { name: "Variables",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_variables.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html",
    rNLnk: ""
  },

  { name: "Data Types",
    r1Src: str_w3s,
    r2Src: str_prT,
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_data_types.asp",
    r2Lnk: "https://introcs.cs.princeton.edu/java/12types/",
    rNLnk: ""
  },

  { name: "Primitive Data Types",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_data_types.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html",
    rNLnk: ""
  },

  { name: "Type Casting",
    r1Src: str_w3s,
    r2Src: str_prT,
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_type_casting.asp",
    r2Lnk: "https://introcs.cs.princeton.edu/java/12types/",
    rNLnk: ""
  },

  { name: str_lBr},

  { name: "Booleans (and Operations)",
    r1Src: str_w3s,
    r2Src: str_prT,
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_booleans.asp",
    r2Lnk: "https://introcs.cs.princeton.edu/java/12types/",
    rNLnk: ""
  },

  { name: "Expressions/Statements/Blocks",
    r1Src: str_orc,
    r2Src: "",
    rNSrc: str_tbd,    
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html",
    r2Lnk: "",
    rNLnk: ""
  },

  { name: "Operators and Operands",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_operators.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html",
    rNLnk: ""
  },

  { name: "Java Math Class (consts/methods)",
    r1Src: str_w3s,
    r2Src: str_w3s,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_math.asp",
    r2Lnk: "https://www.w3schools.com/java/java_ref_math.asp",
    rNLnk: ""
  },

  { name: "Arithmetic and Assignment Operators",
    r1Src: str_orc,
    r2Src: str_w3s,
    rNSrc: str_tbd,   
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html",
    r2Lnk: "https://www.w3schools.com/java/java_operators.asp",
    rNLnk: ""
  },

  { name: "Java Comparison and Logic Operators",
    r1Src: str_orc,
    r2Src: str_w3s,
    rNSrc: str_tbd,   
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html",
    r2Lnk: "https://www.w3schools.com/java/java_operators.asp",
    rNLnk: ""
  },

  { name: str_lBr},

  { name: "Intro to Control Flow Statements",
    r1Src: str_orc,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flowsummary.html",
    rNLnk: ""
  },

  { name: "If-Else Statement (Cond. Ctrl. Flow)",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_conditions.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html",
    rNLnk: ""
  },

  { name: "Switch Statement (Cond. Ctrl. Flow)",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_switch.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html",
    rNLnk: ""
  },

  { name: "[Do] While Loop (Iter. Ctrl. Flow)",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_while_loop.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html",
    rNLnk: ""
  },

  { name: "For Loop (Iter. Ctrl. Flow)",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_for_loop.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html",
    rNLnk: ""
  },

  { name: "Break/Continue (Branch. Ctrl. Flow)",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_break.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html",
    rNLnk: ""
  },

  { name: str_lBr},

  { name: "Enums / Use Thereof",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_enums.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html",
    rNLnk: ""
  },

  { name: "Intro to Strings / Basic Operations",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_strings.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/data/strings.html",
    rNLnk: ""
  },

  { name: "Characters and String Modification",
    r1Src: str_orc,
    r2Src: str_orc,
    rNSrc: str_tbd,
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/data/characters.html",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html",
    rNLnk: ""
  },

  { name: "More String Operations",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_ref_string.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/data/comparestrings.html",
    rNLnk: ""
  },

  { name: str_lBr},

  { name: "Intro to [Java] Objects",
    r1Src: str_orc,
    r2Src: str_w3s,
    rNSrc: str_tbd,
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/concepts/object.html",
    r2Lnk: "https://www.w3schools.com/java/java_classes.asp",
    rNLnk: ""
  },

  { name: "Intro to [Java] Classes",
    r1Src: str_orc,
    r2Src: str_w3s,
    rNSrc: str_tbd,
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/concepts/class.html",
    r2Lnk: "https://www.w3schools.com/java/java_classes.asp",
    rNLnk: ""
  },

  { name: "Intro to [Java] Methods",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_methods.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html",
    rNLnk: ""
  },

  { name: "Method Parms / Args / Return Types",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_methods_param.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html",
    rNLnk: ""
  },

  { name: "Method Overloading",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_methods_overloading.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html",
    rNLnk: ""
  },

  { name: "Class Methods / Attributes",
    r1Src: "Methods (w3schools)",
    r2Src: "Attributes (w3schools)",
    rNSrc: str_tbd,
    r1Lnk: "https://www.w3schools.com/java/java_class_methods.asp",
    r2Lnk: "https://www.w3schools.com/java/java_class_attributes.asp",
    rNLnk: ""
  },

  { name: "Constructors",
    r1Src: str_w3s,
    r2Src: "",
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_constructors.asp",
    r2Lnk: "",
    rNLnk: ""
  },

  { name: "Intro to Recursion",
    r1Src: str_w3s,
    r2Src: "",
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_recursion.asp",
    r2Lnk: "",
    rNLnk: ""
  },

  { name: "Scope (Block/Method/Class)",
    r1Src: str_w3s,
    r2Src: "",
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_scope.asp",
    r2Lnk: "",
    rNLnk: ""
  },

  { name: str_lBr},

  { name: "Arrays (1D, 2D, Operations)",
    r1Src: str_w3s,
    r2Src: str_orc,
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_arrays.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html",
    rNLnk: ""
  },

  { name: "Arrays (Additional Resources)",
    r1Src: str_prT,
    r2Src: "",
    rNSrc: str_tbd,    
    r1Lnk: "https://introcs.cs.princeton.edu/java/14array/",
    r2Lnk: "",
    rNLnk: ""
  },

  { name: str_lBr},

  { name: "Intro Lambda Statements/Calculus",
    r1Src: str_w3s,
    r2Src: str_tbd,
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_lambda.asp",
    r2Lnk: "",
    rNLnk: ""
  },

  { name: "String Print/Num Format",
    r1Src: str_w3s,
    r2Src: "Oracle Num Format",
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_strings.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/data/numberformat.html",
    rNLnk: ""
  },

  { name: "Wrapper Classes / parse[X] Methods",
    r1Src: "Wrapper Class (w3s)",
    r2Src: "Value Parsing (Oracle)",
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_wrapper_classes.asp",
    r2Lnk: "https://docs.oracle.com/javase/tutorial/java/data/converting.html",
    rNLnk: ""
  },

  { name: "Misc Java Util Classes (Time/Date)",
    r1Src: "Time (Oracle Ref)",
    r2Src: "Date (Oracle Ref)",
    rNSrc: str_tbd,    
    r1Lnk: "https://docs.oracle.com/javase/7/docs/api/java/sql/Time.html",
    r2Lnk: "https://docs.oracle.com/javase/7/docs/api/java/util/Date.html",
    rNLnk: ""
  },

  { name: "Intro to Files and File-Types/Sizes",
    r1Src: "Khan Academy",
    r2Src: "",
    rNSrc: str_tbd,    
    r1Lnk: "https://www.khanacademy.org/computing/computers-and-internet/xcae6f4a7ff015e7d:computers/xcae6f4a7ff015e7d:computer-files/a/files-introduction",
    r2Lnk: "",
    rNLnk: ""
  },

  { name: "Java Scanner (Intro to User Input)",
    r1Src: str_w3s,
    r2Src: str_orR,
    rNSrc: str_tbd,    
    r1Lnk: "https://www.w3schools.com/java/java_user_input.asp",
    r2Lnk: "https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html",
    rNLnk: ""
  },

];