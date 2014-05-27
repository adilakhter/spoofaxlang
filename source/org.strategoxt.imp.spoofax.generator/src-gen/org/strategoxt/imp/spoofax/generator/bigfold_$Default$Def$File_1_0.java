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

@SuppressWarnings("all") public class bigfold_$Default$Def$File_1_0 extends Strategy 
{ 
  public static bigfold_$Default$Def$File_1_0 instance = new bigfold_$Default$Def$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4537)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DefaultDefFile_1_0");
    Fail27750:
    { 
      IStrategoTerm x_4537 = null;
      IStrategoTerm z_4537 = null;
      z_4537 = term;
      Success11188:
      { 
        Fail27751:
        { 
          IStrategoTerm a_4538 = null;
          IStrategoTerm c_4538 = null;
          IStrategoTerm d_4538 = null;
          c_4538 = term;
          a_4538 = generator.const7912;
          d_4538 = c_4538;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_4538, a_4538, generator.constCons4561);
          if(term == null)
            break Fail27751;
          if(true)
            break Success11188;
        }
        term = generator.constNil7;
      }
      x_4537 = term;
      term = z_4537;
      term = termFactory.makeTuple(x_4537, term);
      term = w_4537.invoke(context, term, lifted10267.instance);
      if(term == null)
        break Fail27750;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}