package scm;

import jas.*;
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmAsciiCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-ascii-cpe expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-ascii-cpe expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new AsciiCP(arg0));
  }
  public String toString()
  { return ("<#make-ascii-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmClassCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-class-cpe expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-class-cpe expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new ClassCP(arg0));
  }
  public String toString()
  { return ("<#make-class-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmNameTypeCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-name-type-cpe expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-name-type-cpe expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("make-name-type-cpe expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-name-type-cpe expects a String for arg #2"); }
    String arg1 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new NameTypeCP(arg0, arg1));
  }
  public String toString()
  { return ("<#make-name-type-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmFieldCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-field-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-field-cpe expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("make-field-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-field-cpe expects a String for arg #2"); }
    String arg1 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("make-field-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-field-cpe expects a String for arg #3"); }
    String arg2 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new FieldCP(arg0, arg1, arg2));
  }
  public String toString()
  { return ("<#make-field-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmInterfaceCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-interface-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-interface-cpe expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("make-interface-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-interface-cpe expects a String for arg #2"); }
    String arg1 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("make-interface-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-interface-cpe expects a String for arg #3"); }
    String arg2 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new InterfaceCP(arg0, arg1, arg2));
  }
  public String toString()
  { return ("<#make-interface-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmMethodCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-method-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-method-cpe expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("make-method-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-method-cpe expects a String for arg #2"); }
    String arg1 = (tmp!=null)?((Selfrep)tmp).val:null;
    if (t == null) { throw new SchemeError("make-method-cpe expects 3 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-method-cpe expects a String for arg #3"); }
    String arg2 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new MethodCP(arg0, arg1, arg2));
  }
  public String toString()
  { return ("<#make-method-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmIntegerCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-integer-cpe expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("make-integer-cpe expects a number for arg #1"); }
    int arg0 = (int)(Math.round(((Selfrep)tmp).num));
    return new primnode(new IntegerCP(arg0));
  }
  public String toString()
  { return ("<#make-integer-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmFloatCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-float-cpe expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("make-float-cpe expects a number for arg #1"); }
    float arg0 = (float)(((Selfrep)tmp).num);
    return new primnode(new FloatCP(arg0));
  }
  public String toString()
  { return ("<#make-float-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmLongCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-long-cpe expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("make-long-cpe expects a number for arg #1"); }
    long arg0 = (long)(Math.round(((Selfrep)tmp).num));
    return new primnode(new LongCP(arg0));
  }
  public String toString()
  { return ("<#make-long-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmDoubleCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-double-cpe expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("make-double-cpe expects a number for arg #1"); }
    double arg0 = (double)(((Selfrep)tmp).num);
    return new primnode(new DoubleCP(arg0));
  }
  public String toString()
  { return ("<#make-double-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmStringCP extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-string-cpe expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-string-cpe expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new StringCP(arg0));
  }
  public String toString()
  { return ("<#make-string-cpe#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmVar extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-field expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("make-field expects a number for arg #1"); }
    short arg0 = (short)(Math.round(((Selfrep)tmp).num));
    if (t == null) { throw new SchemeError("make-field expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-field expects a CP for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("make-field expects a CP for arg #2"); }
    CP arg1 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("make-field expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-field expects a CP for arg #3"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("make-field expects a CP for arg #3"); }
    CP arg2 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("make-field expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-field expects a ConstAttr for arg #4"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof ConstAttr)) { throw new SchemeError("make-field expects a ConstAttr for arg #4"); }
    ConstAttr arg3 = (tmp != null)?(ConstAttr)(((primnode)tmp).val):null;
    return new primnode(new Var(arg0, arg1, arg2, arg3));
  }
  public String toString()
  { return ("<#make-field#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmConstAttr extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-const expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-const expects a CP for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("make-const expects a CP for arg #1"); }
    CP arg0 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    return new primnode(new ConstAttr(arg0));
  }
  public String toString()
  { return ("<#make-const#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmscmOutputStream extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-outputstream expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-outputstream expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new scmOutputStream(arg0));
  }
  public String toString()
  { return ("<#make-outputstream#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmLabel extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-label expects 1 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof Selfrep)) { throw new SchemeError("make-label expects a String for arg #1"); }
    String arg0 = (tmp!=null)?((Selfrep)tmp).val:null;
    return new primnode(new Label(arg0));
  }
  public String toString()
  { return ("<#make-label#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmClassEnv extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    return new primnode(new ClassEnv());
  }
  public String toString()
  { return ("<#make-class-env#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmCodeAttr extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    return new primnode(new CodeAttr());
  }
  public String toString()
  { return ("<#make-code#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmExceptAttr extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    return new primnode(new ExceptAttr());
  }
  public String toString()
  { return ("<#make-exception#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmCatchtable extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    return new primnode(new Catchtable());
  }
  public String toString()
  { return ("<#make-catchtable#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmCatchEntry extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("make-catch-entry expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-catch-entry expects a Label for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof Label)) { throw new SchemeError("make-catch-entry expects a Label for arg #1"); }
    Label arg0 = (tmp != null)?(Label)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("make-catch-entry expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-catch-entry expects a Label for arg #2"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof Label)) { throw new SchemeError("make-catch-entry expects a Label for arg #2"); }
    Label arg1 = (tmp != null)?(Label)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("make-catch-entry expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-catch-entry expects a Label for arg #3"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof Label)) { throw new SchemeError("make-catch-entry expects a Label for arg #3"); }
    Label arg2 = (tmp != null)?(Label)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("make-catch-entry expects 4 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("make-catch-entry expects a CP for arg #4"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("make-catch-entry expects a CP for arg #4"); }
    CP arg3 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    return new primnode(new CatchEntry(arg0, arg1, arg2, arg3));
  }
  public String toString()
  { return ("<#make-catch-entry#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmIincInsn extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("iinc expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("iinc expects a number for arg #1"); }
    int arg0 = (int)(Math.round(((Selfrep)tmp).num));
    if (t == null) { throw new SchemeError("iinc expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("iinc expects a number for arg #2"); }
    int arg1 = (int)(Math.round(((Selfrep)tmp).num));
    return new primnode(new IincInsn(arg0, arg1));
  }
  public String toString()
  { return ("<#iinc#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmMultiarrayInsn extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("multianewarray expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("multianewarray expects a CP for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("multianewarray expects a CP for arg #1"); }
    CP arg0 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("multianewarray expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("multianewarray expects a number for arg #2"); }
    int arg1 = (int)(Math.round(((Selfrep)tmp).num));
    return new primnode(new MultiarrayInsn(arg0, arg1));
  }
  public String toString()
  { return ("<#multianewarray#>"); }
}
//Autogenerated by typeinfo on Thu Sep 16 14:29:30 EDT 2004
class scmInvokeinterfaceInsn extends Procedure implements Obj
{
  Obj apply(Cell args, Env f)
  throws Exception
  {
    Cell t = args;
    Obj  tmp;
    if (t == null) { throw new SchemeError("invokeinterface expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if ((tmp != null) && !(tmp instanceof primnode)) { throw new SchemeError("invokeinterface expects a CP for arg #1"); }
    if ((tmp != null) && !((((primnode)tmp).val) instanceof CP)) { throw new SchemeError("invokeinterface expects a CP for arg #1"); }
    CP arg0 = (tmp != null)?(CP)(((primnode)tmp).val):null;
    if (t == null) { throw new SchemeError("invokeinterface expects 2 arguments"); }
    tmp = (t.car!=null)?t.car.eval(f):null; t = t.cdr;
    if (!(tmp instanceof Selfrep)) { throw new SchemeError("invokeinterface expects a number for arg #2"); }
    int arg1 = (int)(Math.round(((Selfrep)tmp).num));
    return new primnode(new InvokeinterfaceInsn(arg0, arg1));
  }
  public String toString()
  { return ("<#invokeinterface#>"); }
}
