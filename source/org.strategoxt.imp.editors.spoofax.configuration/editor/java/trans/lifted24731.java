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

@SuppressWarnings("all") final class lifted24731 extends Strategy 
{ 
  public static final lifted24731 instance = new lifted24731();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail87895:
    { 
      IStrategoTerm i_17558 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSpxProjects_1 != ((IStrategoAppl)term).getConstructor())
        break Fail87895;
      i_17558 = term.getSubterm(0);
      term = i_17558;
      if(true)
        return term;
    }
    return null;
  }
}