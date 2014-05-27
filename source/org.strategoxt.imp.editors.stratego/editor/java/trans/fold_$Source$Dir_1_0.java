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

@SuppressWarnings("all") public class fold_$Source$Dir_1_0 extends Strategy 
{ 
  public static fold_$Source$Dir_1_0 instance = new fold_$Source$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4289)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_SourceDir_1_0");
    Fail21988:
    { 
      IStrategoTerm m_4289 = null;
      IStrategoTerm o_4289 = null;
      o_4289 = term;
      Success11886:
      { 
        Fail21989:
        { 
          IStrategoTerm p_4289 = null;
          IStrategoTerm r_4289 = null;
          IStrategoTerm s_4289 = null;
          r_4289 = term;
          p_4289 = trans.const4342;
          s_4289 = r_4289;
          term = dr_lookup_rule_0_2.instance.invoke(context, s_4289, p_4289, trans.constCons1966);
          if(term == null)
            break Fail21989;
          if(true)
            break Success11886;
        }
        term = trans.constNil3;
      }
      m_4289 = term;
      term = o_4289;
      term = termFactory.makeTuple(m_4289, term);
      term = l_4289.invoke(context, term, lifted6724.instance);
      if(term == null)
        break Fail21988;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}