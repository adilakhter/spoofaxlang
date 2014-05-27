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

@SuppressWarnings("all") public class reverse_bagof_get_config_reference_1_0 extends Strategy 
{ 
  public static reverse_bagof_get_config_reference_1_0 instance = new reverse_bagof_get_config_reference_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4636)
  { 
    context.push("reverse_bagof_get_config_reference_1_0");
    Fail22970:
    { 
      TermReference u_4636 = new TermReference();
      TermReference v_4636 = new TermReference();
      if(v_4636.value == null)
        v_4636.value = term;
      else
        if(v_4636.value != term && !v_4636.value.match(term))
          break Fail22970;
      if(u_4636.value == null)
        u_4636.value = term;
      else
        if(u_4636.value != term && !u_4636.value.match(term))
          break Fail22970;
      Success12215:
      { 
        Fail22971:
        { 
          IStrategoTerm z_4636 = null;
          IStrategoTerm b_4637 = null;
          IStrategoTerm c_4637 = null;
          b_4637 = term;
          z_4636 = trans.const4482;
          c_4637 = b_4637;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4637, z_4636, trans.constCons2047);
          if(term == null)
            break Fail22971;
          if(true)
            break Success12215;
        }
        term = trans.constNil4;
      }
      lifted6891 lifted68910 = new lifted6891();
      lifted68910.u_4636 = u_4636;
      lifted68910.v_4636 = v_4636;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted68910, x_4636);
      if(term == null)
        break Fail22970;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}