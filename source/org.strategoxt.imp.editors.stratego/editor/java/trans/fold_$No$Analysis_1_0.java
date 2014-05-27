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

@SuppressWarnings("all") public class fold_$No$Analysis_1_0 extends Strategy 
{ 
  public static fold_$No$Analysis_1_0 instance = new fold_$No$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4302)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_NoAnalysis_1_0");
    Fail22066:
    { 
      IStrategoTerm y_4302 = null;
      IStrategoTerm a_4303 = null;
      a_4303 = term;
      Success11907:
      { 
        Fail22067:
        { 
          IStrategoTerm b_4303 = null;
          IStrategoTerm d_4303 = null;
          IStrategoTerm e_4303 = null;
          d_4303 = term;
          b_4303 = trans.const4349;
          e_4303 = d_4303;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4303, b_4303, trans.constCons1966);
          if(term == null)
            break Fail22067;
          if(true)
            break Success11907;
        }
        term = trans.constNil3;
      }
      y_4302 = term;
      term = a_4303;
      term = termFactory.makeTuple(y_4302, term);
      term = x_4302.invoke(context, term, lifted6751.instance);
      if(term == null)
        break Fail22066;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}