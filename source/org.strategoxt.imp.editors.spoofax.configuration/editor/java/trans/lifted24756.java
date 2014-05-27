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

@SuppressWarnings("all") final class lifted24756 extends Strategy 
{ 
  Strategy y_17570;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87869:
    { 
      lifted24757 lifted247570 = new lifted24757();
      lifted247570.y_17570 = y_17570;
      term = preserve_annos_1_0.instance.invoke(context, term, lifted247570);
      if(term == null)
        break Fail87869;
      if(true)
        return term;
    }
    return null;
  }
}