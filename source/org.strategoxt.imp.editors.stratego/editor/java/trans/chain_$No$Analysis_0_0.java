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

@SuppressWarnings("all") public class chain_$No$Analysis_0_0 extends Strategy 
{ 
  public static chain_$No$Analysis_0_0 instance = new chain_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_NoAnalysis_0_0");
    Fail22070:
    { 
      IStrategoTerm y_4303 = null;
      IStrategoTerm a_4304 = null;
      a_4304 = term;
      Success11909:
      { 
        Fail22071:
        { 
          IStrategoTerm b_4304 = null;
          IStrategoTerm d_4304 = null;
          IStrategoTerm e_4304 = null;
          d_4304 = term;
          b_4304 = trans.const4349;
          e_4304 = d_4304;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4304, b_4304, trans.constCons1966);
          if(term == null)
            break Fail22071;
          if(true)
            break Success11909;
        }
        term = trans.constNil3;
      }
      y_4303 = term;
      term = a_4304;
      term = termFactory.makeTuple(y_4303, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6753.instance);
      if(term == null)
        break Fail22070;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}