package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted21524 extends Strategy 
{ 
  public static final lifted21524 instance = new lifted21524();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail76498:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consterm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76498;
      IStrategoTerm arg25930 = term.getSubterm(0);
      if(arg25930.getTermType() != IStrategoTerm.APPL || Main._consdefault_1 != ((IStrategoAppl)arg25930).getConstructor())
        break Fail76498;
      IStrategoTerm arg25931 = arg25930.getSubterm(0);
      if(arg25931.getTermType() != IStrategoTerm.APPL || Main._consappl_2 != ((IStrategoAppl)arg25931).getConstructor())
        break Fail76498;
      IStrategoTerm arg25932 = arg25931.getSubterm(0);
      if(arg25932.getTermType() != IStrategoTerm.APPL || Main._consunquoted_1 != ((IStrategoAppl)arg25932).getConstructor())
        break Fail76498;
      IStrategoTerm arg25933 = arg25932.getSubterm(0);
      if(arg25933.getTermType() != IStrategoTerm.STRING || !"cons".equals(((IStrategoString)arg25933).stringValue()))
        break Fail76498;
      IStrategoTerm arg25934 = arg25931.getSubterm(1);
      if(arg25934.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg25934).isEmpty())
        break Fail76498;
      IStrategoTerm arg25935 = ((IStrategoList)arg25934).head();
      if(arg25935.getTermType() != IStrategoTerm.APPL || Main._consfun_1 != ((IStrategoAppl)arg25935).getConstructor())
        break Fail76498;
      IStrategoTerm arg25936 = arg25935.getSubterm(0);
      if(arg25936.getTermType() != IStrategoTerm.APPL || Main._consquoted_1 != ((IStrategoAppl)arg25936).getConstructor())
        break Fail76498;
      IStrategoTerm arg25938 = ((IStrategoList)arg25934).tail();
      if(arg25938.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg25938).isEmpty())
        break Fail76498;
      if(true)
        return term;
    }
    return null;
  }
}