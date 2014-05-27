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

@SuppressWarnings("all") public class get_code_output_directory_0_0 extends Strategy 
{ 
  public static get_code_output_directory_0_0 instance = new get_code_output_directory_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_code_output_directory_0_0");
    Fail22762:
    { 
      IStrategoTerm z_4610 = null;
      term = collect_all_2_0.instance.invoke(context, term, lifted6841.instance, union_0_0.instance);
      if(term == null)
        break Fail22762;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail22762;
      z_4610 = ((IStrategoList)term).head();
      IStrategoTerm arg7996 = ((IStrategoList)term).tail();
      if(arg7996.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7996).isEmpty())
        break Fail22762;
      term = z_4610;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}