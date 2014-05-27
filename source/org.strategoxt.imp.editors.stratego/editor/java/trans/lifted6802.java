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

@SuppressWarnings("all") final class lifted6802 extends Strategy 
{ 
  TermReference e_4747;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24111:
    { 
      term = declared_in_generated_file_0_1.instance.invoke(context, term, e_4747.value);
      if(term == null)
        break Fail24111;
      if(true)
        return term;
    }
    return null;
  }
}