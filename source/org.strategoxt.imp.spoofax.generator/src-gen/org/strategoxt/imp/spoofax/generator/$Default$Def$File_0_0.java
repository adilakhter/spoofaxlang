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

@SuppressWarnings("all") public class $Default$Def$File_0_0 extends Strategy 
{ 
  public static $Default$Def$File_0_0 instance = new $Default$Def$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DefaultDefFile_0_0");
    Fail27765:
    { 
      TermReference v_4540 = new TermReference();
      IStrategoTerm y_4540 = null;
      IStrategoTerm a_4541 = null;
      IStrategoTerm b_4541 = null;
      if(v_4540.value == null)
        v_4540.value = term;
      else
        if(v_4540.value != term && !v_4540.value.match(term))
          break Fail27765;
      a_4541 = term;
      y_4540 = generator.const7912;
      b_4541 = a_4541;
      term = dr_lookup_rule_0_2.instance.invoke(context, b_4541, y_4540, generator.constCons4561);
      if(term == null)
        break Fail27765;
      lifted10275 lifted102750 = new lifted10275();
      lifted102750.v_4540 = v_4540;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102750);
      if(term == null)
        break Fail27765;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}