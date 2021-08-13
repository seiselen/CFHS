

var str_w3s = "w3schools Tutorial";
var str_orc = "Oracle Java Tutorial";
var str_prT = "Princeton CS Tutorial"
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

  { name: "Characters in Java",
    r1Src: str_w3s,
    r2Src: "",
    rNSrc: str_tbd,
    r1Lnk: "https://docs.oracle.com/javase/tutorial/java/data/characters.html",
    r2Lnk: "",
    rNLnk: ""
  },

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

  { name: "Java Math Class (consts/methods)",
    r1Src: str_w3s,
    r2Src: str_w3s,
    rNSrc: str_tbd,   
    r1Lnk: "https://www.w3schools.com/java/java_math.asp",
    r2Lnk: "https://www.w3schools.com/java/java_ref_math.asp",
    rNLnk: ""
  },

/*






*/



];