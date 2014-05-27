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

@SuppressWarnings("all") public class reverse_bagof_$Current$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Current$File_1_0 instance = new reverse_bagof_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4283)
  { 
    context.push("reverse_bagof_CurrentFile_1_0");
    Fail21945:
    { 
      TermReference z_4282 = new TermReference();
      if(z_4282.value == null)
        z_4282.value = term;
      else
        if(z_4282.value != term && !z_4282.value.match(term))
          break Fail21945;
      Success11876:
      { 
        Fail21946:
        { 
          IStrategoTerm d_4283 = null;
          IStrategoTerm f_4283 = null;
          IStrategoTerm g_4283 = null;
          f_4283 = term;
          d_4283 = trans.const4263;
          g_4283 = f_4283;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4283, d_4283, trans.constCons1966);
          if(term == null)
            break Fail21946;
          if(true)
            break Success11876;
        }
        term = trans.constNil3;
      }
      lifted6711 lifted67110 = new lifted6711();
      lifted67110.z_4282 = z_4282;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted67110, b_4283);
      if(term == null)
        break Fail21945;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}