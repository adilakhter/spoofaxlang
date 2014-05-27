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
    Fail22839:
    { 
      IStrategoTerm w_4619 = null;
      IStrategoTerm x_4619 = null;
      IStrategoTerm c_4620 = null;
      w_4619 = term;
      x_4619 = trans.constSpoofaxConfigurationGeneratedPpAf;
      term = (IStrategoTerm)termFactory.makeListCons(x_4619, termFactory.makeListCons(trans.constSpoofaxConfigurationPpAf, (IStrategoList)trans.constNil4));
      term = ast2abox_0_1.instance.invoke(context, w_4619, term);
      if(term == null)
        break Fail22839;
      c_4620 = term;
      term = box2text_string_0_1.instance.invoke(context, c_4620, trans.const4484);
      if(term == null)
        break Fail22839;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}