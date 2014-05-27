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

@SuppressWarnings("all") public class bigfold_$Current$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Current$Dir_1_0 instance = new bigfold_$Current$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4307)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentDir_1_0");
    Fail22090:
    { 
      IStrategoTerm c_4307 = null;
      IStrategoTerm e_4307 = null;
      e_4307 = term;
      Success11913:
      { 
        Fail22091:
        { 
          IStrategoTerm f_4307 = null;
          IStrategoTerm h_4307 = null;
          IStrategoTerm i_4307 = null;
          h_4307 = term;
          f_4307 = trans.const4346;
          i_4307 = h_4307;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, i_4307, f_4307, trans.constCons1966);
          if(term == null)
            break Fail22091;
          if(true)
            break Success11913;
        }
        term = trans.constNil3;
      }
      c_4307 = term;
      term = e_4307;
      term = termFactory.makeTuple(c_4307, term);
      term = b_4307.invoke(context, term, lifted6759.instance);
      if(term == null)
        break Fail22090;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}