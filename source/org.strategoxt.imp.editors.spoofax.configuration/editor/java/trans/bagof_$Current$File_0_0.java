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

@SuppressWarnings("all") public class bagof_$Current$File_0_0 extends Strategy 
{ 
  public static bagof_$Current$File_0_0 instance = new bagof_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentFile_0_0");
    Fail87806:
    { 
      TermReference k_17585 = new TermReference();
      if(k_17585.value == null)
        k_17585.value = term;
      else
        if(k_17585.value != term && !k_17585.value.match(term))
          break Fail87806;
      Success47310:
      { 
        Fail87807:
        { 
          IStrategoTerm n_17585 = null;
          IStrategoTerm p_17585 = null;
          IStrategoTerm q_17585 = null;
          p_17585 = term;
          n_17585 = trans.const17872;
          q_17585 = p_17585;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_17585, n_17585, trans.constCons8528);
          if(term == null)
            break Fail87807;
          if(true)
            break Success47310;
        }
        term = trans.constNil14;
      }
      lifted24786 lifted247860 = new lifted24786();
      lifted247860.k_17585 = k_17585;
      term = filter_1_0.instance.invoke(context, term, lifted247860);
      if(term == null)
        break Fail87806;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}