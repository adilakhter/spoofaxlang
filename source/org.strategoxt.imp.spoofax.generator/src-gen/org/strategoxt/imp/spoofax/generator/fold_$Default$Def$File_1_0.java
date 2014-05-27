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

@SuppressWarnings("all") public class fold_$Default$Def$File_1_0 extends Strategy 
{ 
  public static fold_$Default$Def$File_1_0 instance = new fold_$Default$Def$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4538)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DefaultDefFile_1_0");
    Fail27752:
    { 
      IStrategoTerm j_4538 = null;
      IStrategoTerm l_4538 = null;
      l_4538 = term;
      Success11189:
      { 
        Fail27753:
        { 
          IStrategoTerm m_4538 = null;
          IStrategoTerm o_4538 = null;
          IStrategoTerm p_4538 = null;
          o_4538 = term;
          m_4538 = generator.const7912;
          p_4538 = o_4538;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4538, m_4538, generator.constCons4561);
          if(term == null)
            break Fail27753;
          if(true)
            break Success11189;
        }
        term = generator.constNil7;
      }
      j_4538 = term;
      term = l_4538;
      term = termFactory.makeTuple(j_4538, term);
      term = i_4538.invoke(context, term, lifted10268.instance);
      if(term == null)
        break Fail27752;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}