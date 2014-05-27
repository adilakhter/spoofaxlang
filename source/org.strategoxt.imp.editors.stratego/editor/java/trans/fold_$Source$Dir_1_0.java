package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Source$Dir_1_0 extends Strategy 
{ 
  public static fold_$Source$Dir_1_0 instance = new fold_$Source$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4843)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_SourceDir_1_0");
    Fail23464:
    { 
      IStrategoTerm e_4843 = null;
      IStrategoTerm g_4843 = null;
      g_4843 = term;
      Success12595:
      { 
        Fail23465:
        { 
          IStrategoTerm h_4843 = null;
          IStrategoTerm j_4843 = null;
          IStrategoTerm k_4843 = null;
          j_4843 = term;
          h_4843 = trans.const4552;
          k_4843 = j_4843;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4843, h_4843, trans.constCons2047);
          if(term == null)
            break Fail23465;
          if(true)
            break Success12595;
        }
        term = trans.constNil4;
      }
      e_4843 = term;
      term = g_4843;
      term = termFactory.makeTuple(e_4843, term);
      term = d_4843.invoke(context, term, lifted6995.instance);
      if(term == null)
        break Fail23464;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}