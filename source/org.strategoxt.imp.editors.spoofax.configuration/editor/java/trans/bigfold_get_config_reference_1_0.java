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

@SuppressWarnings("all") public class bigfold_get_config_reference_1_0 extends Strategy 
{ 
  public static bigfold_get_config_reference_1_0 instance = new bigfold_get_config_reference_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4634)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_get_config_reference_1_0");
    Fail22959:
    { 
      IStrategoTerm d_4634 = null;
      IStrategoTerm f_4634 = null;
      f_4634 = term;
      Success12210:
      { 
        Fail22960:
        { 
          IStrategoTerm g_4634 = null;
          IStrategoTerm i_4634 = null;
          IStrategoTerm j_4634 = null;
          i_4634 = term;
          g_4634 = trans.const4482;
          j_4634 = i_4634;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4634, g_4634, trans.constCons2047);
          if(term == null)
            break Fail22960;
          if(true)
            break Success12210;
        }
        term = trans.constNil4;
      }
      d_4634 = term;
      term = f_4634;
      term = termFactory.makeTuple(d_4634, term);
      term = c_4634.invoke(context, term, lifted6885.instance);
      if(term == null)
        break Fail22959;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}