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

@SuppressWarnings("all") public class bigchain_$Current$File_0_0 extends Strategy 
{ 
  public static bigchain_$Current$File_0_0 instance = new bigchain_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CurrentFile_0_0");
    Fail21938:
    { 
      IStrategoTerm n_4281 = null;
      IStrategoTerm p_4281 = null;
      p_4281 = term;
      Success11873:
      { 
        Fail21939:
        { 
          IStrategoTerm q_4281 = null;
          IStrategoTerm s_4281 = null;
          IStrategoTerm t_4281 = null;
          s_4281 = term;
          q_4281 = trans.const4263;
          t_4281 = s_4281;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, t_4281, q_4281, trans.constCons1966);
          if(term == null)
            break Fail21939;
          if(true)
            break Success11873;
        }
        term = trans.constNil3;
      }
      n_4281 = term;
      term = p_4281;
      term = termFactory.makeTuple(n_4281, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6707.instance);
      if(term == null)
        break Fail21938;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}