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

@SuppressWarnings("all") public class bigfold_$Source$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Source$Dir_1_0 instance = new bigfold_$Source$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4288)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_SourceDir_1_0");
    Fail21986:
    { 
      IStrategoTerm a_4289 = null;
      IStrategoTerm c_4289 = null;
      c_4289 = term;
      Success11885:
      { 
        Fail21987:
        { 
          IStrategoTerm d_4289 = null;
          IStrategoTerm f_4289 = null;
          IStrategoTerm g_4289 = null;
          f_4289 = term;
          d_4289 = trans.const4342;
          g_4289 = f_4289;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4289, d_4289, trans.constCons1966);
          if(term == null)
            break Fail21987;
          if(true)
            break Success11885;
        }
        term = trans.constNil3;
      }
      a_4289 = term;
      term = c_4289;
      term = termFactory.makeTuple(a_4289, term);
      term = z_4288.invoke(context, term, lifted6723.instance);
      if(term == null)
        break Fail21986;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}