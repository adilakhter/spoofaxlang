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

@SuppressWarnings("all") public class pp_spoofaxconfiguration_string_0_0 extends Strategy 
{ 
  public static pp_spoofaxconfiguration_string_0_0 instance = new pp_spoofaxconfiguration_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_spoofaxconfiguration_string_0_0");
    Fail87647:
    { 
      IStrategoTerm t_17563 = null;
      IStrategoTerm u_17563 = null;
      IStrategoTerm z_17563 = null;
      t_17563 = term;
      u_17563 = trans.constSpoofaxConfigurationGeneratedPpAf;
      term = (IStrategoTerm)termFactory.makeListCons(u_17563, termFactory.makeListCons(trans.constSpoofaxConfigurationPpAf, (IStrategoList)trans.constNil14));
      term = ast2abox_0_1.instance.invoke(context, t_17563, term);
      if(term == null)
        break Fail87647;
      z_17563 = term;
      term = box2text_string_0_1.instance.invoke(context, z_17563, trans.const17871);
      if(term == null)
        break Fail87647;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}