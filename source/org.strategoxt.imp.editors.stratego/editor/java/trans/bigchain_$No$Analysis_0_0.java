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

@SuppressWarnings("all") public class bigchain_$No$Analysis_0_0 extends Strategy 
{ 
  public static bigchain_$No$Analysis_0_0 instance = new bigchain_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_NoAnalysis_0_0");
    Fail22068:
    { 
      IStrategoTerm l_4303 = null;
      IStrategoTerm n_4303 = null;
      n_4303 = term;
      Success11908:
      { 
        Fail22069:
        { 
          IStrategoTerm o_4303 = null;
          IStrategoTerm q_4303 = null;
          IStrategoTerm r_4303 = null;
          q_4303 = term;
          o_4303 = trans.const4349;
          r_4303 = q_4303;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_4303, o_4303, trans.constCons1966);
          if(term == null)
            break Fail22069;
          if(true)
            break Success11908;
        }
        term = trans.constNil3;
      }
      l_4303 = term;
      term = n_4303;
      term = termFactory.makeTuple(l_4303, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6752.instance);
      if(term == null)
        break Fail22068;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}