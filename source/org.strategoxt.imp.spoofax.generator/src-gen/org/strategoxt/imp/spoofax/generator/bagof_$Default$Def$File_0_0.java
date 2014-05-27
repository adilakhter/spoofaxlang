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

@SuppressWarnings("all") public class bagof_$Default$Def$File_0_0 extends Strategy 
{ 
  public static bagof_$Default$Def$File_0_0 instance = new bagof_$Default$Def$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_DefaultDefFile_0_0");
    Fail27763:
    { 
      TermReference o_4540 = new TermReference();
      if(o_4540.value == null)
        o_4540.value = term;
      else
        if(o_4540.value != term && !o_4540.value.match(term))
          break Fail27763;
      Success11194:
      { 
        Fail27764:
        { 
          IStrategoTerm r_4540 = null;
          IStrategoTerm t_4540 = null;
          IStrategoTerm u_4540 = null;
          t_4540 = term;
          r_4540 = generator.const7912;
          u_4540 = t_4540;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4540, r_4540, generator.constCons4561);
          if(term == null)
            break Fail27764;
          if(true)
            break Success11194;
        }
        term = generator.constNil7;
      }
      lifted10274 lifted102740 = new lifted10274();
      lifted102740.o_4540 = o_4540;
      term = filter_1_0.instance.invoke(context, term, lifted102740);
      if(term == null)
        break Fail27763;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}