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

@SuppressWarnings("all") public class fold_$Current$File_1_0 extends Strategy 
{ 
  public static fold_$Current$File_1_0 instance = new fold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4281)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentFile_1_0");
    Fail21936:
    { 
      IStrategoTerm c_4281 = null;
      IStrategoTerm e_4281 = null;
      e_4281 = term;
      Success11872:
      { 
        Fail21937:
        { 
          IStrategoTerm f_4281 = null;
          IStrategoTerm h_4281 = null;
          IStrategoTerm i_4281 = null;
          h_4281 = term;
          f_4281 = trans.const4263;
          i_4281 = h_4281;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4281, f_4281, trans.constCons1966);
          if(term == null)
            break Fail21937;
          if(true)
            break Success11872;
        }
        term = trans.constNil3;
      }
      c_4281 = term;
      term = e_4281;
      term = termFactory.makeTuple(c_4281, term);
      term = b_4281.invoke(context, term, lifted6706.instance);
      if(term == null)
        break Fail21936;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}