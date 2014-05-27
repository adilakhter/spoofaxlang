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

@SuppressWarnings("all") public class bigfold_$Current$File_1_0 extends Strategy 
{ 
  public static bigfold_$Current$File_1_0 instance = new bigfold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4280)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentFile_1_0");
    Fail21934:
    { 
      IStrategoTerm q_4280 = null;
      IStrategoTerm s_4280 = null;
      s_4280 = term;
      Success11871:
      { 
        Fail21935:
        { 
          IStrategoTerm t_4280 = null;
          IStrategoTerm v_4280 = null;
          IStrategoTerm w_4280 = null;
          v_4280 = term;
          t_4280 = trans.const4263;
          w_4280 = v_4280;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4280, t_4280, trans.constCons1966);
          if(term == null)
            break Fail21935;
          if(true)
            break Success11871;
        }
        term = trans.constNil3;
      }
      q_4280 = term;
      term = s_4280;
      term = termFactory.makeTuple(q_4280, term);
      term = p_4280.invoke(context, term, lifted6705.instance);
      if(term == null)
        break Fail21934;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}