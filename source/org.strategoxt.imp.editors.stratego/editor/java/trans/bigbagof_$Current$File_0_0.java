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

@SuppressWarnings("all") public class bigbagof_$Current$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$File_0_0 instance = new bigbagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentFile_0_0");
    Fail21942:
    { 
      TermReference h_4282 = new TermReference();
      if(h_4282.value == null)
        h_4282.value = term;
      else
        if(h_4282.value != term && !h_4282.value.match(term))
          break Fail21942;
      Success11875:
      { 
        Fail21943:
        { 
          IStrategoTerm k_4282 = null;
          IStrategoTerm m_4282 = null;
          IStrategoTerm n_4282 = null;
          m_4282 = term;
          k_4282 = trans.const4263;
          n_4282 = m_4282;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, n_4282, k_4282, trans.constCons1966);
          if(term == null)
            break Fail21943;
          if(true)
            break Success11875;
        }
        term = trans.constNil3;
      }
      lifted6709 lifted67090 = new lifted6709();
      lifted67090.h_4282 = h_4282;
      term = filter_1_0.instance.invoke(context, term, lifted67090);
      if(term == null)
        break Fail21942;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}