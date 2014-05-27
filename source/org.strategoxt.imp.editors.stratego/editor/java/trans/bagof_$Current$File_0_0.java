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

@SuppressWarnings("all") public class bagof_$Current$File_0_0 extends Strategy 
{ 
  public static bagof_$Current$File_0_0 instance = new bagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentFile_0_0");
    Fail21947:
    { 
      TermReference h_4283 = new TermReference();
      if(h_4283.value == null)
        h_4283.value = term;
      else
        if(h_4283.value != term && !h_4283.value.match(term))
          break Fail21947;
      Success11877:
      { 
        Fail21948:
        { 
          IStrategoTerm k_4283 = null;
          IStrategoTerm m_4283 = null;
          IStrategoTerm n_4283 = null;
          m_4283 = term;
          k_4283 = trans.const4263;
          n_4283 = m_4283;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_4283, k_4283, trans.constCons1966);
          if(term == null)
            break Fail21948;
          if(true)
            break Success11877;
        }
        term = trans.constNil3;
      }
      lifted6712 lifted67120 = new lifted6712();
      lifted67120.h_4283 = h_4283;
      term = filter_1_0.instance.invoke(context, term, lifted67120);
      if(term == null)
        break Fail21947;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}