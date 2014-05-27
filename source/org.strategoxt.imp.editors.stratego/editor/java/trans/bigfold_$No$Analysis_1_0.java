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

@SuppressWarnings("all") public class bigfold_$No$Analysis_1_0 extends Strategy 
{ 
  public static bigfold_$No$Analysis_1_0 instance = new bigfold_$No$Analysis_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4856)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_NoAnalysis_1_0");
    Fail23540:
    { 
      IStrategoTerm c_4856 = null;
      IStrategoTerm e_4856 = null;
      e_4856 = term;
      Success12615:
      { 
        Fail23541:
        { 
          IStrategoTerm f_4856 = null;
          IStrategoTerm h_4856 = null;
          IStrategoTerm i_4856 = null;
          h_4856 = term;
          f_4856 = trans.const4559;
          i_4856 = h_4856;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, i_4856, f_4856, trans.constCons2047);
          if(term == null)
            break Fail23541;
          if(true)
            break Success12615;
        }
        term = trans.constNil4;
      }
      c_4856 = term;
      term = e_4856;
      term = termFactory.makeTuple(c_4856, term);
      term = b_4856.invoke(context, term, lifted7021.instance);
      if(term == null)
        break Fail23540;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}