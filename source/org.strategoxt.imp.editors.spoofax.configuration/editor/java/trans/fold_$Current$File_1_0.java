package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Current$File_1_0 extends Strategy 
{ 
  public static fold_$Current$File_1_0 instance = new fold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17583)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentFile_1_0");
    Fail87795:
    { 
      IStrategoTerm f_17583 = null;
      IStrategoTerm h_17583 = null;
      h_17583 = term;
      Success47305:
      { 
        Fail87796:
        { 
          IStrategoTerm i_17583 = null;
          IStrategoTerm k_17583 = null;
          IStrategoTerm l_17583 = null;
          k_17583 = term;
          i_17583 = trans.const17872;
          l_17583 = k_17583;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_17583, i_17583, trans.constCons8528);
          if(term == null)
            break Fail87796;
          if(true)
            break Success47305;
        }
        term = trans.constNil14;
      }
      f_17583 = term;
      term = h_17583;
      term = termFactory.makeTuple(f_17583, term);
      term = e_17583.invoke(context, term, lifted24780.instance);
      if(term == null)
        break Fail87795;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}