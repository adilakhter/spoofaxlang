package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_$New$Project_0_2 extends Strategy 
{ 
  public static aux_$New$Project_0_2 instance = new aux_$New$Project_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4518, IStrategoTerm u_4518)
  { 
    Fail27636:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"228271".equals(((IStrategoString)term).stringValue()))
        break Fail27636;
      term = t_4518;
      if(true)
        return term;
    }
    context.push("aux_NewProject_0_2");
    context.popOnFailure();
    return null;
  }
}